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
 * Scores returned by the {@link ConceptInsights} service.
 * 
 */
public class Scores {

	/** The scores. */
	private List<Score> scores;

	/**
	 * Gets the scores.
	 * 
	 * @return The scores
	 */
	public List<Score> getScores() {
		return scores;
	}

	/**
	 * Sets the scores.
	 * 
	 * @param scores
	 *            The scores
	 */
	public void setScores(List<Score> scores) {
		this.scores = scores;
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
	 * With scores.
	 * 
	 * @param scores
	 *            the scores
	 * @return the scores
	 */
	public Scores withScores(List<Score> scores) {
		this.scores = scores;
		return this;
	}
}