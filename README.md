# This repository is no longer maintained.

Issue reports and pull requests will not be attended.

wso2-dss-connectors
===================

WSO2 Data Services Server from v3.0.0, have the capability to write custom data sources. So any possible data source can be integrated to WSO2 DSS by a couple of standard interfaces defined by data services core. There are two types of custom data sources:

[1] Tabular Based Custom Data Sources
[2] Custom Query Based Data Sources

Tabular Based Custom Data Sources
=================================

This type of data source is implemented when your data source can be defined using a set of data tables, which can be queries using SQL. This type of data source can be created by implementing the interface "org.wso2.carbon.dataservices.core.custom.datasource.TabularDataBasedDS".

Custom Query Based Data Source
==============================

Custom query based data sources are used when simply the data source cannot be represented using a set of data tables and when it is not suitable for SQL to be used as the query language. So using this type of a data source, you can create your own query format and retrieve data from any type of a data set. Also, if there is a data source type that has their own query format, this can be used to directly map to that. The interface "org.wso2.carbon.dataservices.core.custom.datasource.CustomQueryBasedDS" is required to implement this type of data sources.




