#!/usr/bin/env bash
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ONCOKB_PUBLIC_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Public%20APIs}
ONCOKB_PRIVATE_DOCS=${1:-https://www.oncokb.org/api/v1/v2/api-docs?group=Private%20APIs}
ONCOKB_TRANSCRIPT_DOCS=${1:-http://localhost:9090/v3/api-docs}
SWAGGER_CODEGEN_CLI_V2_JAR="swagger-codegen-cli-v2.jar"
SWAGGER_CODEGEN_CLI_V3_JAR="swagger-codegen-cli-v3.jar"

# switch to the script directory
cd ${SCRIPT_DIR}

# only download the client if it is not already downloaded
if [ ! -f ${SWAGGER_CODEGEN_CLI_V2_JAR} ]; then
    wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.12/swagger-codegen-cli-2.4.12.jar  -O ${SWAGGER_CODEGEN_CLI_V2_JAR}
fi

if [ ! -f ${SWAGGER_CODEGEN_CLI_V3_JAR} ]; then
    wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.25/swagger-codegen-cli-3.0.25.jar -O ${SWAGGER_CODEGEN_CLI_V3_JAR}
fi

# remove the modules if available (otherwise some legacy methods in the test will not get removed)
rm -rf ../oncokbPublicApiClient
rm -rf ../oncokbPrivateApiClient
rm -rf ../oncokbTranscriptApiClient

# generate java modules (see config json files for more details)
java -jar ${SWAGGER_CODEGEN_CLI_V2_JAR} generate -i ${ONCOKB_PUBLIC_DOCS} -l java -c oncokbPublicApiClientConfig.json -o ../oncokbPublicApiClient
java -jar ${SWAGGER_CODEGEN_CLI_V2_JAR} generate -i ${ONCOKB_PRIVATE_DOCS} -l java -c oncokbPrivateApiClientConfig.json -o ../oncokbPrivateApiClient
java -jar ${SWAGGER_CODEGEN_CLI_V3_JAR} generate -i ${ONCOKB_TRANSCRIPT_DOCS} -l java -c oncokbTranscriptApiClientConfig.json -o ../oncokbTranscriptApiClient
