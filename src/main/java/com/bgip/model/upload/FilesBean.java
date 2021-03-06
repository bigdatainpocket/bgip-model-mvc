package com.bgip.model.upload;

import com.bgip.model.user.BaseBean;

public class FilesBean extends BaseBean{

	private static final long serialVersionUID = -6966143032293623636L;

	private String fileName;
	
	private String folderId = "0";
	
	private int size;
	
	private boolean favourite;
	
	private String link;

	private String bucketPublicId;
	
	public boolean isFavourite() {
		return favourite;
	}

	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFolderId() {
		return folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getBucketPublicId() {
		return bucketPublicId;
	}

	public void setBucketPublicId(String bucketPublicId) {
		this.bucketPublicId = bucketPublicId;
	}

	
	
	
	
}
