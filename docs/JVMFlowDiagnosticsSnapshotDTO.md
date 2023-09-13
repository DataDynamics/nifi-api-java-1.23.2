
# JVMFlowDiagnosticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uptime** | **String** | How long this node has been running, formatted as hours:minutes:seconds.milliseconds |  [optional]
**timeZone** | **String** | The name of the Time Zone that is configured, if available |  [optional]
**activeTimerDrivenThreads** | **Integer** | The number of timer-driven threads that are active |  [optional]
**activeEventDrivenThreads** | **Integer** | The number of event-driven threads that are active |  [optional]
**bundlesLoaded** | [**List&lt;BundleDTO&gt;**](BundleDTO.md) | The NiFi Bundles (NARs) that are loaded by NiFi |  [optional]



