#!/usr/bin/env bash
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ONCOKB_PUBLIC_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Public%20APIs}
ONCOKB_PRIVATE_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Private%20APIs}
ONCOKB_TRANSCRIPT_DOCS=${1:-https://transcript.oncokb.org/v3/api-docs}

SWAGGER_CODEGEN_CLI_V2_JAR="swagger-codegen-cli-v2.jar"
SWAGGER_CODEGEN_CLI_V3_JAR="swagger-codegen-cli-v3.jar"
OPENAPI_GENERATOR_CLI_V5_JAR="openapi-generator-cli-5.3.1.jar"

# switch to the script directory
cd ${SCRIPT_DIR}

# only download the client if it is not already downloaded
if [ ! -f ${SWAGGER_CODEGEN_CLI_V2_JAR} ]; then
    wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.12/swagger-codegen-cli-2.4.12.jar  -O ${SWAGGER_CODEGEN_CLI_V2_JAR}
fi

if [ ! -f ${SWAGGER_CODEGEN_CLI_V3_JAR} ]; then
    wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.30/swagger-codegen-cli-3.0.30.jar -O ${SWAGGER_CODEGEN_CLI_V3_JAR}
fi

if [ ! -f ${OPENAPI_GENERATOR_CLI_V5_JAR} ]; then
    wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.3.1/openapi-generator-cli-5.3.1.jar -O ${OPENAPI_GENERATOR__CLI_V5_JAR}
fi

# remove the modules if available (otherwise some legacy methods in the test will not get removed)
rm -rf ../oncokbPublicApiClient
rm -rf ../oncokbPrivateApiClient
rm -rf ../oncokbTranscriptApiClient

# generate java modules (see config json files for more details)
java -jar ${OPENAPI_GENERATOR_CLI_V5_JAR} generate -i ${ONCOKB_PUBLIC_DOCS} -g java -c oncokbPublicApiClientConfig.json -o ../oncokbPublicApiClient
java -jar ${OPENAPI_GENERATOR_CLI_V5_JAR} generate -i ${ONCOKB_PRIVATE_DOCS} -g java -c oncokbPrivateApiClientConfig.json -o ../oncokbPrivateApiClient
java -jar ${OPENAPI_GENERATOR_CLI_V5_JAR} generate -i ${ONCOKB_TRANSCRIPT_DOCS} -g java -c oncokbTranscriptApiClientConfig.json -o ../oncokbTranscriptApiClient
