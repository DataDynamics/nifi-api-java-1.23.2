
# ReplayLastEventSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventsReplayed** | **List&lt;Long&gt;** | The IDs of the events that were successfully replayed |  [optional]
**failureExplanation** | **String** | If unable to replay an event, specifies why the event could not be replayed |  [optional]
**eventAvailable** | **Boolean** | Whether or not an event was available. This may not be populated if there was a failure. |  [optional]



