
# ThreadDumpDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeId** | **String** | The ID of the node in the cluster |  [optional]
**nodeAddress** | **String** | The address of the node in the cluster |  [optional]
**apiPort** | **Integer** | The port the node is listening for API requests. |  [optional]
**stackTrace** | **String** | The stack trace for the thread |  [optional]
**threadName** | **String** | The name of the thread |  [optional]
**threadActiveMillis** | **Long** | The number of milliseconds that the thread has been executing in the Processor |  [optional]
**taskTerminated** | **Boolean** | Indicates whether or not the user has requested that the task be terminated. If this is true, it may indicate that the thread is in a state where it will continue running indefinitely without returning. |  [optional]



