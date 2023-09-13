# Apache NiFi 1.23.2 버전을 위한 Java API Client

## 작성 개요

* NiFi 소스코드를 다운로드하여 swagger.json 파일을 확인
* Swagger Codegen으로 swagger.json 파일을 로딩하여 Java로 변환
* 변환된 코드에서 NiFi 상위버전 부터 SSL 필수이므로 SSL 인증서 처리 및 OAuth 인증 처리 부분 수정
  * OkHTTP를 사용하므로 SSL을 무시하도록 하고 Basic Auth, OAuth2를 추가하도록 함 

## Swagger Codegen

```
# cd nifi-1.23.2
# mvn -Dmaven.test.skip=true install
# wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.32/swagger-codegen-cli-2.4.32.jar
# java -jar swagger-codegen-cli-2.4.32.jar generate -i ../nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/target/swagger-ui/swagger.json -l java
```

## Requirements

* Apache Maven

## Installation

```shell
mvn install
```

## API 호출

API 호출을 위해서 Basic Auth로 Access Token을 얻습니다.

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccessApi;

import java.io.File;
import java.util.*;

public class AccessApiExample {

    public static void main(String[] args) {
        AccessApi accessApi = new AccessApi();
        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.addDefaultHeader("Authorization", getBasicAuthenticationHeader("admin", "adminadminadmin"));
        client.setBasePath("https://localhost:8443/nifi-api");

        accessApi.setApiClient(client);
        String accessToken = accessApi.createAccessToken("admin", "adminadminadmin");
    }
}

```

Access Token을 이용하여 API를 호출합니다.

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccessApi;

import java.io.File;
import java.util.*;

public class ResourcesApiExample {

    public static void main(String[] args) {
        ResourcesApi api = new ResourcesApi();

        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.setBasePath("https://localhost:8443/nifi-api");
        client.addDefaultHeader("Authorization", String.format("Bearer %s", accessToken));
        api.setApiClient(client);

        ResourcesEntity response = api.getResources();
    }
}
```
