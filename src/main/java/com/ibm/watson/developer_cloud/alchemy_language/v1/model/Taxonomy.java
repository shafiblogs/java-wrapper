
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

package com.ibm.watson.developer_cloud.alchemy_language.v1.model;

import com.ibm.watson.developer_cloud.alchemy_language.v1.AlchemyLanguage;

import java.util.ArrayList;
import java.util.List;

/**
 * Taxonomy returned by the {@link AlchemyLanguage} service.
 *
 * @author Nizar Alseddeg (nmalsedd@us.ibm.com)
 */
public class Taxonomy {

    /** The url. */
    private String url;

    /** The total transactions. */
    private String totalTransactions;

    /** The language. */
    private String language;

    /** The taxonomy. */
    private List<TaxonomyEntry> taxonomy = new ArrayList<TaxonomyEntry>();

    /**
     * Gets the url.
     *
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * With url.
     *
     * @param url the url
     * @return the taxonomy
     */
    public Taxonomy withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Gets the total transactions.
     *
     * @return The totalTransactions
     */
    public String getTotalTransactions() {
        return totalTransactions;
    }

    /**
     * Sets the total transactions.
     *
     * @param totalTransactions The totalTransactions
     */
    public void setTotalTransactions(String totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

    /**
     * With total transactions.
     *
     * @param totalTransactions the total transactions
     * @return the taxonomy
     */
    public Taxonomy withTotalTransactions(String totalTransactions) {
        this.totalTransactions = totalTransactions;
        return this;
    }

    /**
     * Gets the language.
     *
     * @return The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     *
     * @param language The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * With language.
     *
     * @param language the language
     * @return the taxonomy
     */
    public Taxonomy withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Gets the taxonomy.
     *
     * @return The taxonomy
     */
    public List<TaxonomyEntry> getTaxonomy() {
        return taxonomy;
    }

    /**
     * Sets the taxonomy.
     *
     * @param taxonomy The taxonomy
     */
    public void setTaxonomy(List<TaxonomyEntry> taxonomy) {
        this.taxonomy = taxonomy;
    }

    /**
     * With taxonomy.
     *
     * @param taxonomy the taxonomy
     * @return the taxonomy
     */
    public Taxonomy withTaxonomy(List<TaxonomyEntry> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Taxonomy taxonomy1 = (Taxonomy) o;

        if (url != null ? !url.equals(taxonomy1.url) : taxonomy1.url != null) return false;
        if (totalTransactions != null ? !totalTransactions.equals(taxonomy1.totalTransactions) : taxonomy1.totalTransactions != null)
            return false;
        if (language != null ? !language.equals(taxonomy1.language) : taxonomy1.language != null) return false;
        return !(taxonomy != null ? !taxonomy.equals(taxonomy1.taxonomy) : taxonomy1.taxonomy != null);

    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (totalTransactions != null ? totalTransactions.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (taxonomy != null ? taxonomy.hashCode() : 0);
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Taxonomy [url=%s,totalTransactions=%s,language=%s,taxonomy=%s]", url, totalTransactions, language, taxonomy);
    }
}