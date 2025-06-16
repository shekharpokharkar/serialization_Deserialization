package com.seleniumexpress.Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Demo implements Externalizable {

	int iNo1;
	int iNo2;
	String str;

	public Demo() {
		System.out.println("Inside Demo noargs constructor");
	}

	public Demo(int iNo1, int iNo2, String str) {

		this.iNo1 = iNo1;
		this.iNo2 = iNo2;
		this.str = str;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Inside write external");
		out.writeInt(iNo1);
		out.writeObject(str);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("Inside read external");
		iNo1= in.readInt();
		str = (String) in.readObject();

	}

	@Override
	public String toString() {
		return "Demo [iNo1=" + iNo1 + ", iNo2=" + iNo2 + ", str=" + str + "]";
	}

}
