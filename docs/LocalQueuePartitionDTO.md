
# LocalQueuePartitionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalFlowFileCount** | **Integer** | Total number of FlowFiles owned by the Connection |  [optional]
**totalByteCount** | **Long** | Total number of bytes that make up the content for the FlowFiles owned by this Connection |  [optional]
**activeQueueFlowFileCount** | **Integer** | Total number of FlowFiles that exist in the Connection&#39;s Active Queue, immediately available to be offered up to a component |  [optional]
**activeQueueByteCount** | **Long** | Total number of bytes that make up the content for the FlowFiles that are present in the Connection&#39;s Active Queue |  [optional]
**swapFlowFileCount** | **Integer** | The total number of FlowFiles that are swapped out for this Connection |  [optional]
**swapByteCount** | **Long** | Total number of bytes that make up the content for the FlowFiles that are swapped out to disk for the Connection |  [optional]
**swapFiles** | **Integer** | The number of Swap Files that exist for this Connection |  [optional]
**inFlightFlowFileCount** | **Integer** | The number of In-Flight FlowFiles for this Connection. These are FlowFiles that belong to the connection but are currently being operated on by a Processor, Port, etc. |  [optional]
**inFlightByteCount** | **Long** | The number bytes that make up the content of the FlowFiles that are In-Flight |  [optional]
**allActiveQueueFlowFilesPenalized** | **Boolean** | Whether or not all of the FlowFiles in the Active Queue are penalized |  [optional]
**anyActiveQueueFlowFilesPenalized** | **Boolean** | Whether or not any of the FlowFiles in the Active Queue are penalized |  [optional]



