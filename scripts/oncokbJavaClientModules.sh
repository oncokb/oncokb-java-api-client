#!/usr/bin/env bash
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ONCOKB_PUBLIC_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Public%20APIs}
ONCOKB_PRIVATE_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Private%20APIs}
ONCOKB_CURATION_DOCS=${1:-http://beta.curation.oncokb.dev.aws.mskcc.org/v3/api-docs}

OPENAPI_GENERATOR_CLI_VERSION="5.3.1"
OPENAPI_GENERATOR_CLI_V5_JAR="openapi-generator-cli-${OPENAPI_GENERATOR_CLI_VERSION}.jar"

# switch to the script directory
cd ${SCRIPT_DIR}

# only download the client if it is not already downloaded


if [ ! -f ${OPENAPI_GENERATOR_CLI_V5_JAR} ]; then
    wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/"$OPENAPI_GENERATOR_CLI_VERSION"/openapi-generator-cli-"$OPENAPI_GENERATOR_CLI_VERSION".jar -O ${OPENAPI_GENERATOR_CLI_V5_JAR}
fi

# remove the modules if available (otherwise some legacy methods in the test will not get removed)
rm -rf ../oncokbPublicApiClient
rm -rf ../oncokbPrivateApiClient
rm -rf ../oncokbCurationApiClient

# generate java modules (see config json files for more details)
java -jar ${OPENAPI_GENERATOR_CLI_V5_JAR} generate -i ${ONCOKB_PUBLIC_DOCS} -g java -c oncokbPublicApiClientConfig.json -o ../oncokbPublicApiClient
java -jar ${OPENAPI_GENERATOR_CLI_V5_JAR} generate -i ${ONCOKB_PRIVATE_DOCS} -g java -c oncokbPrivateApiClientConfig.json -o ../oncokbPrivateApiClient
java -jar ${OPENAPI_GENERATOR_CLI_V5_JAR} generate -i ${ONCOKB_CURATION_DOCS} -g java -c oncokbCurationApiClientConfig.json -o ../oncokbCurationApiClient
