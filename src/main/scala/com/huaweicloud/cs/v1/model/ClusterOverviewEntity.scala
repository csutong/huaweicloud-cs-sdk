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

case class ClusterOverviewEntity(
  /* 集群总数 */
  totalClusters: Option[Int],
  /* 运行的集群总数 */
  runningClusterCount: Option[Int],
  /* 已完成的集群总数 */
  exceptionClusterCount: Option[Int],
  /* 运行异常的集群总数 */
  otherClusterCount: Option[Int],
  /* 正在运行的集群总费用 */
  runningClusterCharge: Option[Int],
  /* 正在运行的集群单价合计 */
  runningClusterPrice: Option[Int],
  /* 正在运行的集群消耗SPU总数 */
  runningClusterTotalSpu: Option[Int],
  /* 正在运行的集群总时长 */
  runningClusterTotalTime: Option[Int],
  /* 结算币种 */
  billingUnit: Option[ClusterOverviewEntityEnums.BillingUnit],
  /* 时间单位 */
  timeUnit: Option[ClusterOverviewEntityEnums.TimeUnit]
) extends ApiModel

object ClusterOverviewEntityEnums {

  type BillingUnit = BillingUnit.Value
  type TimeUnit = TimeUnit.Value

  object BillingUnit extends Enumeration {
    val CNY = Value("CNY")
    val HKD = Value("HKD")
    val EUR = Value("EUR")
    val DEM = Value("DEM")
    val USD = Value("USD")
  }

  object TimeUnit extends Enumeration {
    val HOUR = Value("HOUR")
  }

}

