/*	VIDIS is a simulation and visualisation framework for distributed systems.
	Copyright (C) 2009 Dominik Psenner, Christoph Caks
	This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
	This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
	You should have received a copy of the GNU General Public License along with this program; if not, see <http://www.gnu.org/licenses/>. */
package vidis.ui.vis.shader.variable;

import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;

public enum DataType {
	// TODO add other datatypes
	VEC3("vec3", Vector3d.class),
	VEC4("vec4", Vector4d.class), //TODO  Vector3f ( create  Vector3f first )
	FLOAT("float", Float.class),
	BOOL("bool", Boolean.class);
	
	private String type;
	private Class javarepresentation;
	private DataType(String type, Class rep) {
		this.type = type;
		this.javarepresentation = rep;
	}
	
	public String getType() {
		return this.type;
	}
	public Class getJavaClass() {
		return javarepresentation;
	}

	public static DataType byTypeValue(String type) {
		if (type.equals("vec3")) return DataType.VEC3;
		if (type.equals("vec4")) return DataType.VEC4;
		if (type.equals("float")) return DataType.FLOAT;
		if (type.equals("bool")) return DataType.BOOL;
		return null;
	}
	
}
