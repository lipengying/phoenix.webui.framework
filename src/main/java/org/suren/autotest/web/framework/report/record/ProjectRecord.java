/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.suren.autotest.web.framework.report.record;

import java.util.List;
import java.util.Map;

/**
 * 项目信息记录
 * @author suren
 * @date 2016年9月6日 下午8:31:35
 */
public class ProjectRecord
{
    private String osInfo;
    private String browserInfo;
    private String addressInfo;
    private Map<String, String> userInfo;

	private List<SuiteRecord> suiteRecordList;

	public String getOsInfo()
	{
		return osInfo;
	}

	public void setOsInfo(String osInfo)
	{
		this.osInfo = osInfo;
	}

	public String getBrowserInfo()
	{
		return browserInfo;
	}

	public void setBrowserInfo(String browserInfo)
	{
		this.browserInfo = browserInfo;
	}

	public String getAddressInfo()
	{
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo)
	{
		this.addressInfo = addressInfo;
	}

	public Map<String, String> getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(Map<String, String> userInfo)
	{
		this.userInfo = userInfo;
	}

	/**
	 * @return the suiteRecordList
	 */
	public List<SuiteRecord> getSuiteRecordList()
	{
		return suiteRecordList;
	}

	/**
	 * @param suiteRecordList the suiteRecordList to set
	 */
	public void setSuiteRecordList(List<SuiteRecord> suiteRecordList)
	{
		this.suiteRecordList = suiteRecordList;
	}
}
