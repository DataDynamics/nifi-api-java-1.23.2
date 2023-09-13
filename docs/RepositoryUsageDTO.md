
# RepositoryUsageDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the repository |  [optional]
**fileStoreHash** | **String** | A SHA-256 hash of the File Store name/path that is used to store the repository&#39;s data. This information is exposed as a hash in order to avoid exposing potentially sensitive information that is not generally relevant. What is typically relevant is whether or not multiple repositories on the same node are using the same File Store, as this indicates that the repositories are competing for the resources of the backing disk/storage mechanism. |  [optional]
**freeSpace** | **String** | Amount of free space. |  [optional]
**totalSpace** | **String** | Amount of total space. |  [optional]
**freeSpaceBytes** | **Long** | The number of bytes of free space. |  [optional]
**totalSpaceBytes** | **Long** | The number of bytes of total space. |  [optional]
**utilization** | **String** | Utilization of this storage location. |  [optional]



