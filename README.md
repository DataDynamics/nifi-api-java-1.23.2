# Apache NiFi 1.23.2 버전을 위한 Java API Client

## Swagger Codegen

```
# cd nifi-1.23.2
# mvn -Dmaven.test.skip=true install
# wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.32/swagger-codegen-cli-2.4.32.jar
# java -jar swagger-codegen-cli-2.4.32.jar generate -i ../nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/target/swagger-ui/swagger.json -l java
```

## Requirements

* Apache Maven
* JDK 1.8 이상

## Installation

```shell
mvn install
```

## API 호출

API 호출을 위해서 Basic Auth로 Access Token을 얻습니다.

```java
import io.datadynamics.nifi.api.ApiClient;
import io.datadynamics.nifi.api.api.AccessApi;
import com.squareup.okhttp.Credentials;

public class AccessApiExample {

    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
              
        AccessApi accessApi = new AccessApi();
        ApiClient client = new ApiClient(true);
        client.setDebugging(true);
        client.addDefaultHeader("Authorization", Credentials.basic(username, password));
        client.setBasePath("https://localhost:8443/nifi-api");

        accessApi.setApiClient(client);
        String accessToken = accessApi.createAccessToken(username, password);
    }
}

```

Access Token을 이용하여 API를 호출합니다.

```java
import io.datadynamics.nifi.api.ApiClient;
import io.datadynamics.nifi.api.model.*;

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
