/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.core.model.workspace.devfile;

import java.util.List;
import java.util.Map;

/** Defines Devfile. */
public interface Devfile {

  /** Returns Specification Version. It is required. */
  String getSpecVersion();

  /**
   * Returns the name of the devfile. Workspaces created from devfile, will inherit this name. It is
   * required.
   */
  String getName();

  /**
   * Returns projects configurations which are related to the devfile, when devfile doesn't contain
   * projects returns empty list. It is optional, devfile may contain 0 or N project configurations.
   */
  List<? extends Project> getProjects();

  /**
   * Returns components configurations which are related to the devfile, when devfile doesn't
   * contain components returns empty list. It is optional, devfile may contain 0 or N components.
   */
  List<? extends Component> getComponents();

  /**
   * Returns commands which are related to the devfile, when devfile doesn't contain commands
   * returns empty list. It is optional, devfile may contain 0 or N commands.
   */
  List<? extends Command> getCommands();

  /** Returns devfile attributes. Devfile attributes must not contain null keys or values. */
  Map<String, String> getAttributes();
}
