/*! ******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.amazon.hive.job;

import java.util.Arrays;
import java.util.List;

import org.pentaho.di.job.entry.loadSave.JobEntryLoadSaveTestSupport;

public class AmazonHiveJobExecutorLoadSaveTest extends JobEntryLoadSaveTestSupport<AmazonHiveJobExecutor> {

  @Override
  protected Class<AmazonHiveJobExecutor> getJobEntryClass() {
    return AmazonHiveJobExecutor.class;
  }

  @Override
  protected List<String> listCommonAttributes() {
    return Arrays.asList( "HadoopJobName", "HadoopJobFlowId", "QUrl", "AccessKey", "SecretKey",
      "BootstrapActions", "StagingDir", "NumInstances", "MasterInstanceType", "SlaveInstanceType",
      "CmdLineArgs", "Alive", "Blocking", "LoggingInterval", "HadoopJobName" );
  }
}
