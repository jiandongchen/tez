/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tez.runtime.library.common.comparator;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.WritableComparator;

public class TezBytesComparator extends WritableComparator {

  public TezBytesComparator() {
    super(BytesWritable.class);
  }

  /**
   * Compare the buffers in serialized form.
   */
  @Override
  public int compare(byte[] b1, int s1, int l1,
      byte[] b2, int s2, int l2) {
    return compareBytes(b1, s1, l1, b2, s2, l2);
  }

}