
# RuntimeManifest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | A unique identifier for the manifest |  [optional]
**agentType** | **String** | The type of the runtime binary, e.g., &#39;minifi-java&#39; or &#39;minifi-cpp&#39; |  [optional]
**version** | **String** | The version of the runtime binary, e.g., &#39;1.0.1&#39; |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) | Build summary for this runtime binary |  [optional]
**bundles** | [**List&lt;Bundle&gt;**](Bundle.md) | All extension bundles included with this runtime |  [optional]
**schedulingDefaults** | [**SchedulingDefaults**](SchedulingDefaults.md) | Scheduling defaults for components defined in this manifest |  [optional]



