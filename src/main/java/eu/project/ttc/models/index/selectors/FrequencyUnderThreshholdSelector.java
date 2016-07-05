
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

package eu.project.ttc.models.index.selectors;

import eu.project.ttc.models.Term;
import eu.project.ttc.models.TermIndex;

public class FrequencyUnderThreshholdSelector extends AbstractTermSelector {
	
	private int threshhold;

	public FrequencyUnderThreshholdSelector(int threshhold) {
		super(false);
		this.threshhold = threshhold;
	}
	
	public int getThreshhold() {
		return threshhold;
	}

	@Override
	public boolean select(TermIndex termIndex, Term t) {
		return t.getFrequency() < this.threshhold;
	}
}
