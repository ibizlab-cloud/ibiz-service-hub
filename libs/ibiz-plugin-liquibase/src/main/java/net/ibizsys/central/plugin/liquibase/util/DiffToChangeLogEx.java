package net.ibizsys.central.plugin.liquibase.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import liquibase.change.core.CreateIndexChange;
import liquibase.change.core.DropIndexChange;
import liquibase.change.core.ModifyDataTypeChange;
import liquibase.changelog.ChangeSet;
import liquibase.diff.DiffResult;
import liquibase.diff.output.DiffOutputControl;
import liquibase.diff.output.changelog.DiffToChangeLog;

public class DiffToChangeLogEx extends DiffToChangeLog {

	public DiffToChangeLogEx(DiffOutputControl diffOutputControl) {
		super(diffOutputControl);
		// TODO Auto-generated constructor stub
	}

	public DiffToChangeLogEx(DiffResult diffResult, DiffOutputControl diffOutputControl) {
		super(diffResult, diffOutputControl);
		// TODO Auto-generated constructor stub
	}


	@Override
    public List<ChangeSet> generateChangeSets() {
        
		List<ChangeSet> list = new ArrayList<ChangeSet>();
		List<ChangeSet> list2 = new ArrayList<ChangeSet>();

        List<ChangeSet> changeSets = super.generateChangeSets();
        if(!ObjectUtils.isEmpty(changeSets)) {
        	for(ChangeSet changetSet : changeSets) {
        		if(!ObjectUtils.isEmpty(changetSet.getChanges())) {
        			if(changetSet.getChanges().get(0) instanceof DropIndexChange) {
        				changetSet.setFailOnError(false);
        				list.add(changetSet);
        				continue;
        			}
        			
        			if(changetSet.getChanges().get(0) instanceof CreateIndexChange) {
        				changetSet.setFailOnError(false);
        				list2.add(changetSet);
        				continue;
        			}
        			
        			if(changetSet.getChanges().get(0) instanceof ModifyDataTypeChange) {
        				changetSet.setFailOnError(false);
        				list2.add(changetSet);
        				continue;
        			}
        		}
        		
        		list2.add(changetSet);
        	}
        	
        	list.addAll(list2);
        }
        
//        for (Change change : changes) {
//            ChangeSet changeSet = new ChangeSet(generateId(changes), getChangeSetAuthor(), false, false, this.changeSetPath, changeSetContext,
//                    null, false, quotingStrategy, null);
//            changeSet.setCreated(created);
//            if (diffOutputControl.getLabels() != null) {
//                changeSet.setLabels(diffOutputControl.getLabels());
//            }
//            changeSet.addChange(change);
//            changeSets.add(changeSet);
//        }
//        
//        EmptyChange emptyChange = new EmptyChange();
        
        return list;
    }
	
}
