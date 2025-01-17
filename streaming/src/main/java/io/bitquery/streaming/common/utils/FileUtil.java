package io.bitquery.streaming.common.utils;

/*
 * Copyright (c) [2016] [ <ether.camp> ] This file is part of the ethereumJ library.
 *
 * The ethereumJ library is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * The ethereumJ library is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with the ethereumJ
 * library. If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.File;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

@Slf4j(topic = "utils")
public class FileUtil {

    public static void createParentDirectories(String path) {
        try {
            FileUtils.createParentDirectories(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static long sizeOf(String path) {
        return FileUtils.sizeOf(new File(path));
    }

    public static boolean isExists(String path) {
        File file = new File(path);
        return file.exists();
    }
}
