
# ProcessorDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processor** | [**ProcessorDTO**](ProcessorDTO.md) | Information about the Processor for which the Diagnostic Report is generated |  [optional]
**processorStatus** | [**ProcessorStatusDTO**](ProcessorStatusDTO.md) | The Status for the Processor for which the Diagnostic Report is generated |  [optional]
**referencedControllerServices** | [**List&lt;ControllerServiceDiagnosticsDTO&gt;**](ControllerServiceDiagnosticsDTO.md) | Diagnostic Information about all Controller Services that the Processor is referencing |  [optional]
**incomingConnections** | [**List&lt;ConnectionDiagnosticsDTO&gt;**](ConnectionDiagnosticsDTO.md) | Diagnostic Information about all incoming Connections |  [optional]
**outgoingConnections** | [**List&lt;ConnectionDiagnosticsDTO&gt;**](ConnectionDiagnosticsDTO.md) | Diagnostic Information about all outgoing Connections |  [optional]
**jvmDiagnostics** | [**JVMDiagnosticsDTO**](JVMDiagnosticsDTO.md) | Diagnostic Information about the JVM and system-level diagnostics |  [optional]
**threadDumps** | [**List&lt;ThreadDumpDTO&gt;**](ThreadDumpDTO.md) | Thread Dumps that were taken of the threads that are active in the Processor |  [optional]
**classLoaderDiagnostics** | [**ClassLoaderDiagnosticsDTO**](ClassLoaderDiagnosticsDTO.md) | Information about the Controller Service&#39;s Class Loader |  [optional]



