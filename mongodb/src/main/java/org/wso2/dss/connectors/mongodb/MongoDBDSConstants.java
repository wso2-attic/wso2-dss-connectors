/*
 *  Copyright (c) 2005-2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.dss.connectors.mongodb;

/**
 * Constants related to WSO2 DSS MongoDB connector.
 */
public class MongoDBDSConstants {

	public static final String SERVERS = "servers";
	
	public static final String DATABASE = "database";
	
	public static final String WRITE_CONCERN = "write_concern";
	
	public static final String READ_PREFERENCE = "read_preference";
	
	public static final String AUTO_CONNECT_RETRY = "autoConnectRetry ";
	
	public static final String CONNECT_TIMEOUT = "connectTimeout";
	
	public static final String MAX_WAIT_TIME = "maxWaitTime";
	
	public static final String SOCKET_TIMEOUT = "socketTimeout";
	
	public static final String CONNECTIONS_PER_HOST = "connectionsPerHost";
	
	public static final String THREADS_ALLOWED_TO_BLOCK_CONN_MULTIPLIER = "threadsAllowedToBlockForConnectionMultiplier ";
	
	public static final String RESULT_COLUMN_NAME = "document";
	
	public static class MongoOperationLabels {
		
		public static final String COUNT = "count";
		public static final String DROP = "drop";
		public static final String FIND = "find";
		public static final String FIND_ONE = "findOne";
		public static final String INSERT = "insert";
		public static final String REMOVE = "remove";
		public static final String UPDATE = "update";
		
	}
	
	public static enum MongoOperation {
		COUNT,
		DROP,
		FIND,
		FIND_ONE,
		INSERT,
		REMOVE,
		UPDATE
	}
	
}
