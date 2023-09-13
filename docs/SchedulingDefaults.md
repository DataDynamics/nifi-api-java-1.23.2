
# SchedulingDefaults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultSchedulingStrategy** | [**DefaultSchedulingStrategyEnum**](#DefaultSchedulingStrategyEnum) | The name of the default scheduling strategy |  [optional]
**defaultSchedulingPeriodMillis** | **Long** | The default scheduling period in milliseconds |  [optional]
**penalizationPeriodMillis** | **Long** | The default penalization period in milliseconds |  [optional]
**yieldDurationMillis** | **Long** | The default yield duration in milliseconds |  [optional]
**defaultRunDurationNanos** | **Long** | The default run duration in nano-seconds |  [optional]
**defaultMaxConcurrentTasks** | **String** | The default concurrent tasks |  [optional]
**defaultConcurrentTasksBySchedulingStrategy** | **Map&lt;String, Integer&gt;** | The default concurrent tasks for each scheduling strategy |  [optional]
**defaultSchedulingPeriodsBySchedulingStrategy** | **Map&lt;String, String&gt;** | The default scheduling period for each scheduling strategy |  [optional]


<a name="DefaultSchedulingStrategyEnum"></a>
## Enum: DefaultSchedulingStrategyEnum
Name | Value
---- | -----
EVENT_DRIVEN | &quot;EVENT_DRIVEN&quot;
TIMER_DRIVEN | &quot;TIMER_DRIVEN&quot;
PRIMARY_NODE_ONLY | &quot;PRIMARY_NODE_ONLY&quot;
CRON_DRIVEN | &quot;CRON_DRIVEN&quot;



