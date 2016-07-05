
/*******************************************************************************
 * Copyright 2015-2016 - CNRS (Centre National de Recherche Scientifique)
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *******************************************************************************/

package eu.project.ttc.models.index.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

public class SaveOptions extends IOOptions {

	private Optional<String> mongoDBOccStore = Optional.absent();
	
	public SaveOptions mongoDBOccStoreURI(String mongoDBOccStoreURI) {
		Preconditions.checkNotNull(mongoDBOccStore, "MongoDBUri must nopt be null");
		this.mongoDBOccStore = Optional.of(mongoDBOccStoreURI);
		this.embedOccurrences = false;
		return this;
	}
	
	public boolean isMongoDBOccStore() {
		return this.mongoDBOccStore.isPresent();
	}
	
	public String getMongoDBOccStore() {
		return mongoDBOccStore.get();
	}
	
	
	private IOOptions ioOptionsDelegate = new IOOptions();
	public SaveOptions withOccurrences(boolean withOccurrences) {
		ioOptionsDelegate.withOccurrences(withOccurrences);
		return this;
	}
	public SaveOptions embedOccurrences(boolean embedOccurrences) {
		ioOptionsDelegate.embedOccurrences(embedOccurrences);
		return this;
	}
	public SaveOptions withContexts(boolean withContexts) {
		ioOptionsDelegate.withContexts(withContexts);
		return this;
	}
	public boolean withOccurrences() {
		return ioOptionsDelegate.withOccurrences();
	}
	public boolean occurrencesEmbedded() {
		return ioOptionsDelegate.occurrencesEmbedded();
	}
	public boolean withContexts() {
		return ioOptionsDelegate.withContexts();
	}
	
}
