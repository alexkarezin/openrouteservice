/*
 *  Licensed to GIScience Research Group, Heidelberg University (GIScience)
 *
 *   http://www.giscience.uni-hd.de
 *   http://www.heigit.org
 *
 *  under one or more contributor license agreements. See the NOTICE file 
 *  distributed with this work for additional information regarding copyright 
 *  ownership. The GIScience licenses this file to you under the Apache License, 
 *  Version 2.0 (the "License"); you may not use this file except in compliance 
 *  with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package heigit.ors.routing.graphhopper.extensions;

public class WheelchairAttributes {
	private float _incline = 0.0F;
	private float _slopedCurbHeight  = 0.0F;
	private float _width = 0.0F;
	private int _surfaceType = -1;
	private int _trackType = -1;
	private int _smoothnessType = -1;

	private boolean _hasAttributes = false;

	public WheelchairAttributes()
	{

	}

	public boolean hasValues()
	{
		return _hasAttributes;
	}

	public void reset()
	{
		_hasAttributes = false;
		_incline = 0.0F;
		_slopedCurbHeight  = 0.0F;
		_width = 0.0F;
		_surfaceType = -1;
		_trackType= -1;
		_smoothnessType = -1;
	}

	public float getIncline() {
		return _incline;
	}

	public void setIncline(float incline) {
		_incline = incline;
		_hasAttributes = true;
	}

	public int getSurfaceType() {
		return _surfaceType;
	}

	public void setSurfaceType(int surfaceType) {
		_surfaceType = surfaceType;
		_hasAttributes = true;
	}

	public float getSlopedCurbHeight() {
		return _slopedCurbHeight;
	}

	public void setSlopedCurbHeight(float slopedCurbHeight) {
		_slopedCurbHeight = slopedCurbHeight;
		_hasAttributes = true;
	}

	public int getTrackType() {
		return _trackType;
	}

	public void setTrackType(int trackType) {
		_trackType = trackType;
		_hasAttributes = true;
	}

	public int getSmoothnessType() {
		return _smoothnessType;
	}

	public void setSmoothnessType(int smoothnessType) {
		_smoothnessType = smoothnessType;
		_hasAttributes = true;
	}

	public float getWidth() { return _width; }

	public void setWidth(float width)  {
		_width = width;
		_hasAttributes = true;
	}
	
	public boolean equals(WheelchairAttributes attrs)
	{
		return _surfaceType == attrs._surfaceType && _smoothnessType == attrs._smoothnessType && _trackType == attrs._trackType && _slopedCurbHeight == attrs._slopedCurbHeight && _incline == attrs._incline && _width == attrs._width;
	}

	public WheelchairAttributes copy() {
		WheelchairAttributes at = new WheelchairAttributes();
		at._hasAttributes = this._hasAttributes;
		at._incline = this._incline;
		at._width = this._width;
		at._surfaceType = this._surfaceType;
		at._smoothnessType = this._smoothnessType;
		at._trackType = this._trackType;
		at._slopedCurbHeight = this._slopedCurbHeight;

		return at;
	}
}
