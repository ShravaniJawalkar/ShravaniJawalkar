package javaCore;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Shop extends WorkAddress implements Externalizable {
private int workId;
private String workName;
private int age;

public Shop() {}

public int getWorkId() {
	return workId;
}
public void setWorkId(int workId) {
	this.workId = workId;
}
public String getWorkName() {
	return workName;
}
public void setWorkName(String workName) {
	this.workName = workName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeInt(getWorkId());
	out.writeInt(getAge());
	out.writeObject(getWorkName());
	out.writeObject(getWorkPrimary());
	out.writeObject(getWorkSecondary());
	
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	setWorkId(in.readInt());
	setAge(in.readInt());
	setWorkName((String)in.readObject());
	setWorkPrimary((String)in.readObject());
	setWorkSecondary((String)in.readObject());
	
}

}
