package controllers;

import CLI.FootBallClub;
import java.util.Comparator;

public class WinSortingComparator implements Comparator<FootBallClub> {

	@Override
	public int compare(FootBallClub o1, FootBallClub o2) {
		return o1.getFCWins()-o2.getFCWins();
	}
}
