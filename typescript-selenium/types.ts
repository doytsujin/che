/*********************************************************************
 * Copyright (c) 2018 Red Hat, Inc.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/

const TYPES = {
    Driver: Symbol.for("Driver"),
    LoginPage: Symbol.for("LoginPage")
}

const CLASSES = {
    DriverHelper: "DriverHelper",
    Dashboard: "Dashboard",
    Workspaces: "Workspaces",
    NewWorkspace: "NewWorkspace",
    WorkspaceDetails: "WorkspaceDetails",
    WorkspaceDetailsPlugins: "WorkspaceDetailsPlugins",
    Ide: "Ide",
    TestWorkspaceUtil: "TestWorkspaceUtil",
    ProjectTree: "ProjectTree",
    Editor: "Editor",
}

export { TYPES, CLASSES };
