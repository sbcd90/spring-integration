/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.samples.filecopy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrating the file copy scenario using binary file source and target.
 * 
 * @author Marius Bogoevici
 */
public class BinaryFileCopyDemo {

	public static void main(String[] args) {
		FileCopyDemoCommon.setupDirectories();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("fileCopyDemo-binary.xml",
				BinaryFileCopyDemo.class);
	}
	
}

