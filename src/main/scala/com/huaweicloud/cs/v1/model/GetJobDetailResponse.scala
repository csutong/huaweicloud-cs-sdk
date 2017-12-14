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

case class GetJobDetailResponse(
  /* 消息类型ID */
  messageId: Option[String],
  /* 消息内容 */
  message: Option[String],
  /* 当前时间, 毫秒数 */
  currentTime: Option[Long],
  payload: Option[JobDetailEntity]
) extends ApiModel


