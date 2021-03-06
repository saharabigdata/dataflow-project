/**
 * Copyright (c) 2017 Sahara Labs Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and
 * limitations there under.
 */
name := "google-cloud-dataflow-example-project"

lazy val root = project.in(file("."))
  .settings(BuildSettings.buildSettings)
  .settings(
    libraryDependencies ++= Seq(
      Dependencies.Libraries.gcpBigtableHBase,
      Dependencies.Libraries.hbaseCommon,
      Dependencies.Libraries.hbaseClient,
      Dependencies.Libraries.specs2,
      Dependencies.Libraries.json4s,
      Dependencies.Libraries.json4sExt,
      Dependencies.Libraries.typesafe,
      Dependencies.Libraries.hadoopCommon,
      Dependencies.Libraries.jodaTime
    )
  )

shellPrompt := { _ => "gcp-dataflow-example-project> " }
