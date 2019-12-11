/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jira;

public enum JiraType {

    // add a new comment
    ADDCOMMENT,
    // add a new issue
    ADDISSUE,
    // add an attachment to an issue
    ATTACH,
    // delete an issue
    DELETEISSUE,
    // retrieve recent issues
    @Deprecated
    // use NEWISSUES instead
    NEWISSUE,
    NEWISSUES,
    // retrieve recent comments from any issues
    @Deprecated
    NEWCOMMENT,
    // use NEWCOMMENTS instead
    NEWCOMMENTS,
    // update the fields of an issue
    UPDATEISSUE,
    // transition a status and resolution of an issue
    TRANSITIONISSUE,
    // add/remove watchers of an issue
    WATCHERS
}