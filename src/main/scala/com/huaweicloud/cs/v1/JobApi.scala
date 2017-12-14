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
package com.huaweicloud.cs.v1

import java.io.File

import com.huaweicloud.cs.v1.client._
import com.huaweicloud.cs.v1.model._

object JobApi {

  /**
   * 删除任何状态的作业
   *
   * Expected answers:
   * code 200 : Boolean (删除作业成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param body 删除作业, JSON数组中为一到多个作业ID
   */
  def deleteJob(xProjectId: String, body: Seq[Long]): ApiRequest[Boolean] =
    ApiRequest[Boolean](ApiMethods.DELETE, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-id}/job", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[Boolean](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * Get job detail information.
   *
   * Expected answers:
   * code 200 : GetJobDetailResponse (查询作业详情成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param jobId 作业ID
   */
  def getJobDetail(xProjectId: String, jobId: Long): ApiRequest[GetJobDetailResponse] =
    ApiRequest[GetJobDetailResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/job/{job_id}", "application/json")
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("job_id", jobId)
      .withSuccessResponse[GetJobDetailResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * The execution graph is json format.
   *
   * Expected answers:
   * code 200 : JobExecutePlanResponse (查询作业执行图成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param jobId 作业ID
   */
  def getJobExecuteGraph(xProjectId: String, jobId: Long): ApiRequest[JobExecutePlanResponse] =
    ApiRequest[JobExecutePlanResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/job/{job_id}/execute_graph", "application/json")
      .withPathParam("X-Project-Id", xProjectId)
      .withPathParam("job_id", jobId)
      .withSuccessResponse[JobExecutePlanResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * 作业列表查询, 支持以下参数: name, status, show_detail, cursor, next, limit, order. The cursor here is job id.
   *
   * Expected answers:
   * code 200 : QueryJobListResponse (查询作业列表成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param name 作业名
   * @param status 作业状态码, 请参考CloudStream文档
   * @param clusterId 用户预留集群ID
   * @param showDetail 是否返回作业详情信息
   * @param cursor 作业ID游标
   * @param next 是否向下翻页
   * @param limit 返回的数据条数
   * @param order 查询结果排序, 升序和降序两种可选
   */
  def getJobs(xProjectId: String, name: Option[String] = None, status: Option[String] = None, clusterId: Option[Int] = None, showDetail: Option[Boolean], cursor: Option[Long] = None, next: Option[Boolean], limit: Option[Int], order: Option[String]): ApiRequest[QueryJobListResponse] =
    ApiRequest[QueryJobListResponse](ApiMethods.GET, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/jobs", "application/json")
      .withQueryParam("name", name)
      .withQueryParam("status", status)
      .withQueryParam("cluster_id", clusterId)
      .withQueryParam("show_detail", showDetail)
      .withQueryParam("cursor", cursor)
      .withQueryParam("next", next)
      .withQueryParam("limit", limit)
      .withQueryParam("order", order)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[QueryJobListResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * 触发运行作业
   *
   * Expected answers:
   * code 200 : JobStatusResponse (运行作业请求发送成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param body 运行作业, JSON数组中为一到多个作业ID
   */
  def runJob(xProjectId: String, body: Seq[Long]): ApiRequest[JobStatusResponse] =
    ApiRequest[JobStatusResponse](ApiMethods.POST, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/job/run", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[JobStatusResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   *
   *
   * Expected answers:
   * code 200 : JobStatusResponse (停止作业的请求发送成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param body 停止作业, JSON数组中为一到多个作业ID
   */
  def stopJob(xProjectId: String, body: Seq[Long]): ApiRequest[JobStatusResponse] =
    ApiRequest[JobStatusResponse](ApiMethods.POST, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/job/stop", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[JobStatusResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * 用户自定义作业目前支持jar格式, 运行在预留集群中
   *
   * Expected answers:
   * code 200 : JobStatusResponse (更新Jar作业成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param name 作业名称
   * @param desc 作业描述
   * @param clusterId 预留的集群资源ID, 当前用户有该预留资源的使用权限
   * @param spuNumber 用户为作业选择的SPU数量
   * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false
   * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径
   * @param jar upload user defined jar
   */
  def submitJarJob(xProjectId: String, name: String, desc: Option[String] = None, clusterId: Option[Long] = None, spuNumber: Option[Int] = None, logEnabled: Option[Boolean] = None, obsBucket: Option[String] = None, jar: Option[File] = None): ApiRequest[JobStatusResponse] =
    ApiRequest[JobStatusResponse](ApiMethods.POST, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/jar_job", "multipart/form-data")
      .withFormParam("name", name)
      .withFormParam("desc", desc)
      .withFormParam("cluster_id", clusterId)
      .withFormParam("spu_number", spuNumber)
      .withFormParam("log_enabled", logEnabled)
      .withFormParam("obs_bucket", obsBucket)
      .withFormParam("jar", jar)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[JobStatusResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * 通过POST方式, 提交流式SQL作业, 请求体为JSON格式
   *
   * Expected answers:
   * code 200 : JobStatusResponse (流式SQL作业提交成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param body JSON格式的请求体
   */
  def submitSqlJob(xProjectId: String, body: SubmitSqlJobRequest): ApiRequest[JobStatusResponse] =
    ApiRequest[JobStatusResponse](ApiMethods.POST, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/sql_job", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[JobStatusResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * 目前仅支持Jar格式, 运行在预留集群中
   *
   * Expected answers:
   * code 200 : JobStatusResponse (更新用户自定义Jar作业成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param jobId 作业ID
   * @param name 作业名称
   * @param desc 作业描述
   * @param clusterId 预留的集群资源ID, 当前用户有该预留资源的使用权限
   * @param spuNumber 用户为作业选择的SPU数量
   * @param logEnabled 是否开启作业日志, true开启, false关闭, 默认false
   * @param obsBucket log_enabled&#x3D;&#x3D;true是, 用户授权保存日志的OBS路径
   * @param jar upload user defined jar
   */
  def updateJarJob(xProjectId: String, jobId: String, name: Option[String] = None, desc: Option[String] = None, clusterId: Option[Long] = None, spuNumber: Option[Int] = None, logEnabled: Option[Boolean] = None, obsBucket: Option[String] = None, jar: Option[File] = None): ApiRequest[JobStatusResponse] =
    ApiRequest[JobStatusResponse](ApiMethods.PATCH, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/jar_job", "multipart/form-data")
      .withFormParam("job_id", jobId)
      .withFormParam("name", name)
      .withFormParam("desc", desc)
      .withFormParam("cluster_id", clusterId)
      .withFormParam("spu_number", spuNumber)
      .withFormParam("log_enabled", logEnabled)
      .withFormParam("obs_bucket", obsBucket)
      .withFormParam("jar", jar)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[JobStatusResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)

  /**
   * 流式SQL的语法扩展了Apache Flink SQL, 具体详情请参考CloudStream官方文档
   *
   * Expected answers:
   * code 200 : SqlJobUpdateResponse (流式SQL作业更新成功)
   * code 400 : GlobalErrorResponse (无效的输入参数)
   *
   * @param xProjectId project id, 用于不同project取token.
   * @param body 提交修改SQL作业请求
   */
  def updateSqlJob(xProjectId: String, body: UpdateSqlJobRequest): ApiRequest[SqlJobUpdateResponse] =
    ApiRequest[SqlJobUpdateResponse](ApiMethods.PATCH, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/sql_job", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[SqlJobUpdateResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)


}

