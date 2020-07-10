/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.fhirengine.index

import java.math.BigDecimal

/** A number index for a specific resource.  */
internal data class NumberIndex(
  /** The name of the number index, e.g. "".  */
  val name: String,
  /** The path of the number index, e.g. "".  */
  val path: String,
  /** The value of the number index, e.g. "".  */
  val value: BigDecimal
)
