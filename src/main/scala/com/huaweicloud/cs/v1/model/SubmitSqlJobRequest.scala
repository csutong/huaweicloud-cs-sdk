/**
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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 */
package com.huaweicloud.cs.v1.model

import com.huaweicloud.cs.v1.client.ApiModel

case class SubmitSqlJobRequest(
  /* 作业名称 */
  name: String,
  /* 作业描述 */
  desc: Option[String],
  /* 作业模板ID, 如果template_id和sql_body都不为空, 优先sql_body; 如果template_id不空, sql_body为空, 以template_id内容填充sql_body */
  templateId: Option[Long],
  /* 预留的集群资源ID, 前提是当前用户有该预留资源的使用权限 */
  clusterId: Option[Int],
  /* Stream SQL语句, 至少包含source, query, sink三个部分 */
  sqlBody: Option[String],
  /* 作业运行模式，共享或者独享 */
  runMode: SubmitSqlJobRequestEnums.RunMode,
  /* 用户为作业选择的SPU数量 */
  spuNumber: Option[Int],
  /* 用户设置的作业并行数 */
  parallelNumber: Option[Int],
  /* 是否开启作业自动快照功能, true开启, false关闭, 默认false */
  checkpointEnabled: Option[Boolean],
  /* 快照模式, 两种可选, exactly_once和at_least_once */
  checkpointMode: Option[SubmitSqlJobRequestEnums.CheckpointMode],
  /* 快照时间间隔, 单位为秒 */
  checkpointInterval: Option[Int],
  /* checkpoint_enabled==true是, 用户授权保存快照的OBS路径 */
  obsBucket: Option[String],
  /* 是否开启作业的日志上传到用户的OBS功能 */
  logEnabled: Option[Boolean]
) extends ApiModel

object SubmitSqlJobRequestEnums {

  type RunMode = RunMode.Value
  type CheckpointMode = CheckpointMode.Value

  object RunMode extends Enumeration {
    val SharedCluster = Value("shared_cluster")
    val ExclusiveCluster = Value("exclusive_cluster")
  }

  object CheckpointMode extends Enumeration {
    val ExactlyOnce = Value("exactly_once")
    val AtLeastOnce = Value("at_least_once")
  }

}

