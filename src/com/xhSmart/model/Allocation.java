package com.xhSmart.model;

import java.sql.Timestamp;
/**
 * 
 * @author lin
 *
 */
public class Allocation {
	private int project_id;                       //project_id
	private Project Project;                      //user_project
	private int user_id;                          //user_id
    private User User;                           //project_users
    private int user_task;
    private UserTask task;
    private int user_jurisdictionGroup;             //jurisdictionGroup_id
    private JurisdictionGroup jurisdictionGroup;  //user_jurisdiction_inProject
    private Timestamp user_joinTime;              //joinTime
    private Timestamp endTime;
    private String endTimeStr;
    private String UserName;
    private String path;
    public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getEndTimeStr() {
		return endTimeStr;
	}
	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}
	private int isQuit;                         //isQuit
    private String name;
    private long progress;
    
    public long getProgress() {
		return progress;
	}
	public void setProgress(long progress) {
		this.progress = progress;
	}
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	public UserTask getTask() {
		return task;
	}
	public void setTask(UserTask task) {
		this.task = task;
	}
	public Project getProject() {
		return Project;
	}
	public void setProject(Project project) {
		Project = project;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public int getIsQuit() {
		return isQuit;
	}
	public void setIsQuit(int isQuit) {
		this.isQuit = isQuit;
	}
	public int getUser_task() {
		return user_task;
	}
	public void setUser_task(int user_task) {
		this.user_task = user_task;
	}
	public int getUser_jurisdictionGroup() {
		return user_jurisdictionGroup;
	}
	public void setUser_jurisdictionGroup(int user_jurisdictionGroup) {
		this.user_jurisdictionGroup = user_jurisdictionGroup;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public JurisdictionGroup getJurisdictionGroup() {
		return jurisdictionGroup;
	}
	public void setJurisdictionGroup(JurisdictionGroup jurisdictionGroup) {
		this.jurisdictionGroup = jurisdictionGroup;
	}
	public Timestamp getUser_joinTime() {
		return user_joinTime;
	}
	public void setUser_joinTime(Timestamp user_joinTime) {
		this.user_joinTime = user_joinTime;
	}

    
}
