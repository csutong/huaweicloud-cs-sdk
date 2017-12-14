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

case class JobTemplate(
  /* 模板ID */
  templateId: Option[Long],
  /* 模板名称 */
  name: Option[String],
  /* 模板描述 */
  desc: Option[String],
  /* 模板创建时间 */
  createTime: Option[Long],
  /* 模板更新时间 */
  updateTime: Option[Long],
  /* Stream SQL语句, 至少包含source, query, sink三个部分 */
  sqlBody: Option[String]
) extends ApiModel


