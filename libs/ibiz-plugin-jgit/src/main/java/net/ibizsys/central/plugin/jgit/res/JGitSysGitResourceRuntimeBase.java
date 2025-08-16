package net.ibizsys.central.plugin.jgit.res;

import java.io.File;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.res.SysGitResourceRuntimeBase;
import net.ibizsys.runtime.util.IAction;

public abstract class JGitSysGitResourceRuntimeBase extends SysGitResourceRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(JGitSysGitResourceRuntimeBase.class);
	
	@Override
	protected File onCheckout(Object target, IAction iAction) throws Throwable {
		
		File file = this.getFile(target);
		String strPath = file.getCanonicalPath();
		String strGitPath = this.getResourceUri(target);
		String strBranch = this.getBranch(target);
		if (!StringUtils.hasLength(strBranch)) {
			strBranch = "master";
		}
		String strGitUserName = this.getClientId(target);
		String strGitPassword = this.getClientSecret(target);
	
		if (file.exists()) {
			try (FileRepository fr = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(fr)) {
				PullCommand pullCommand = git.pull().setRemoteBranchName(strBranch);
				if (StringUtils.hasLength(strGitUserName)) {
					if (StringUtils.hasLength(strGitPassword)) {
						pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
					} else {
						pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
					}
				}
				pullCommand.call();
			}

		} else {
			file.mkdirs();
			CloneCommand cloneCommand = Git.cloneRepository().setURI(strGitPath).setDirectory(file).setBranch(strBranch);
			if (StringUtils.hasLength(strGitUserName)) {
				if (StringUtils.hasLength(strGitPassword)) {
					cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
				} else {
					cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
				}
			}
			cloneCommand.call();
		}
		
		if(iAction!=null) {
			Object ret = iAction.execute(new Object[] {file});
			if(ret instanceof Boolean && ((Boolean)ret)) {
				this.checkin(target);
			}
		}
		
		return file;
	}
	
	
	@Override
	protected void onCheckin(Object target) throws Throwable {
		
		File file = this.getFile(target);
		
		if (!file.exists()) {
			return;
		}
		
		String strPath = file.getCanonicalPath();
		String strGitUserName = this.getClientId(target);
		String strGitPassword = this.getClientSecret(target);
	

		// 自动添加差异文件
		try (FileRepository repository = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(repository)) {

			Status status = git.status().call();

			if (!ObjectUtils.isEmpty(status.getUntracked()) || !ObjectUtils.isEmpty(status.getModified()) || !ObjectUtils.isEmpty(status.getMissing())) {

				if (!ObjectUtils.isEmpty(status.getMissing())) {
					for (String strRemoveFile : status.getMissing()) {
						git.rm().addFilepattern(strRemoveFile).call();
					}
				}

				if (!ObjectUtils.isEmpty(status.getUntracked()) || !ObjectUtils.isEmpty(status.getModified())) {
					git.add().addFilepattern(".").call();
				}

				CommitCommand commitCommand = git.commit();

				PersonIdent committer = new PersonIdent(strGitUserName, "");

				RevCommit revCommit = commitCommand.setCommitter(committer).setMessage(String.format("系统资源[%1$s]提交", this.getName())).call();
				// System.out.print(revCommit.getShortMessage());

				PushCommand pushCommand = git.push();

				if (StringUtils.hasLength(strGitUserName)) {
					if (StringUtils.hasLength(strGitPassword)) {
						pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
					} else {
						pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
					}
				}
				pushCommand.call();
			}
		}
	}
	
	
}
