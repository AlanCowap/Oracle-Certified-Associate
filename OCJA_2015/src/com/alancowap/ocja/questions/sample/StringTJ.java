
package com.alancowap.ocja.questions.sample;

public class StringTJ{
	public static void main(String[] args){
		String str = new String("Why did the chicken cross the road");
		StringBuilder sb = new StringBuilder("Because it wanted people to stop judging its movtives");

		System.out.println(str.compareTo(sb.toString()));

		str.concat(sb.toString());
		System.out.println(str);
		
		sb.insert(0, str);
		System.out.println(sb);

		System.out.println(str.replace("the chicken", "Foghorn Leghorn"));
		System.out.println(sb.replace(43, 58, "motive"));
}}

/*
Given this code what would the outcome be

A)	21
	Why did the chicken cross the roadBecause it wanted people to stop judging its movtives
	Why did the chicken cross the roadBecause it wanted people to stop judging its movtives
	Why did the chicken cross the road
	Why did the chicken cross the roadBecause it wanted people to stop judging its motive
B)	0
	Why did the chicken cross the roadBecause it wanted people to stop judging its movtives
	Because it wanted people to stop judging its movtives
	Why did the chicken cross the roadBecause it wanted people to stop judging its motive
C)	21,
	Why did the chicken cross the road
	Why did the chicken cross the roadBecause it wanted people to stop judging its movtives
	Why did Foghorn Leghorn cross the road
	Why did the chicken cross the roadBecause imotive to stop judging its movtives
D)	0,
	Why did the chicken cross the road
	Because it wanted people to stop judging its movtives
	Why did Foghorn Leghorn cross the road
	Why did Foghorn Leghorn cross the roadBecause imotive to stop judging its movtives
E) Compiler error

*/