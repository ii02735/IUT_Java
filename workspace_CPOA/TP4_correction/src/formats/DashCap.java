package formats;

import gerantMessages.IFormat;

public class DashCap implements IFormat {
        public String getTexteAvecFormat(String s) {
             return s.toUpperCase();
        }

		@Override
		public String getMotif() {
			 return " # ";
		}
}
