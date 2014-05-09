/**********************************************************************
Copyright (c) 2012 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.store.neo4j.fieldmanager;

import org.datanucleus.metadata.AbstractMemberMetaData;
import org.datanucleus.state.ObjectProvider;
import org.datanucleus.store.neo4j.Neo4jUtils;
import org.neo4j.graphdb.PropertyContainer;

/**
 * FieldManager for the retrieval of embedded POJO from Neo4j Node.
 */
public class FetchEmbeddedFieldManager extends FetchFieldManager
{
    public FetchEmbeddedFieldManager(ObjectProvider op, PropertyContainer propObj, AbstractMemberMetaData ownerMmd)
    {
        super(op, propObj);
        this.ownerMmd = ownerMmd;
    }

    protected String getPropName(int fieldNumber)
    {
        return Neo4jUtils.getPropertyNameForEmbeddedField(ownerMmd, fieldNumber);
    }
}
