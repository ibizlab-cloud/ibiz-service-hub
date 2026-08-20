package net.ibizsys.central.cloud.kb.core.util.jackrabbit;

import java.util.List;

import javax.jcr.RepositoryException;

import org.apache.jackrabbit.core.id.NodeId;
import org.apache.jackrabbit.core.persistence.bundle.AbstractBundlePersistenceManager;
import org.apache.jackrabbit.core.persistence.util.BLOBStore;
import org.apache.jackrabbit.core.persistence.util.NodePropBundle;
import org.apache.jackrabbit.core.state.ItemStateException;
import org.apache.jackrabbit.core.state.NoSuchItemStateException;
import org.apache.jackrabbit.core.state.NodeReferences;

public class KBDavBundlePersistenceManager extends AbstractBundlePersistenceManager {

	@Override
	public NodeReferences loadReferencesTo(NodeId id) throws NoSuchItemStateException, ItemStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsReferencesTo(NodeId targetId) throws ItemStateException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<NodeId> getAllNodeIds(NodeId after, int maxCount) throws ItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected NodePropBundle loadBundle(NodeId id) throws ItemStateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void storeBundle(NodePropBundle bundle) throws ItemStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void destroyBundle(NodePropBundle bundle) throws ItemStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void destroy(NodeReferences refs) throws ItemStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void store(NodeReferences refs) throws ItemStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected BLOBStore getBlobStore() {
		// TODO Auto-generated method stub
		return null;
	}

}
