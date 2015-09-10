/*
 * *
 *  * Copyright 2015 IBM Corp. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import java.util.List;

import com.ibm.watson.developer_cloud.concept_insights.v2.ConceptInsights;
import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * Graphs returned by the {@link ConceptInsights} service.
 * 
 */
public class Corpora {

	/** The corpora. */
	private List<Corpus> corpora;

	/**
	 * Gets the corpora.
	 * 
	 * @return The corpora
	 */
	public List<Corpus> getCorpora() {
		return corpora;
	}

	/**
	 * Sets the corpora.
	 * 
	 * @param corpora
	 *            The corpora
	 */
	public void setCorpora(List<Corpus> corpora) {
		this.corpora = corpora;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " " + GsonSingleton.getGson().toJson(this);
	}

	/**
	 * With corpora.
	 * 
	 * @param corpora
	 *            the corpora
	 * @return the corpora
	 */
	public Corpora withCorpora(List<Corpus> corpora) {
		this.corpora = corpora;
		return this;
	}
}