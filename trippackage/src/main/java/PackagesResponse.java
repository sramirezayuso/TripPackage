import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import trip.Package;

public class PackagesResponse implements Serializable {
	public List<Package> packages;
	
	public PackagesResponse() {
		this.packages = new LinkedList<Package>();
	}

	public void addPackage(Package aPackage) {
		this.packages.add(aPackage);
	}
}
