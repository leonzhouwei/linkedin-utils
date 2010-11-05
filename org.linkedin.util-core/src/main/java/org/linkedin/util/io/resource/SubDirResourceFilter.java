/*
 * Copyright 2010-2010 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.linkedin.util.io.resource;

/**
 * Simple filter to check for filter only sub directories... stateless
 * 
 * @author ypujante@linkedin.com
 *
 */
public class SubDirResourceFilter implements ResourceFilter
{
  public static final SubDirResourceFilter INSTANCE = new SubDirResourceFilter();

  public static SubDirResourceFilter instance()
  {
    return INSTANCE;
  }

  /**
   * Constructor
   */
  public SubDirResourceFilter()
  {
  }

  /**
   * Tests whether this resource should be included in the result.
   *
   * @param resource the resource to check
   * @return <code>true</code> if the resource should be included
   */
  @Override
  public boolean accept(Resource resource)
  {
    return resource.isDirectory();
  }
}
