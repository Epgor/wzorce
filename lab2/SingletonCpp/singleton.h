#pragma once

#include <string>
#include <vector>
#include <iostream>

class Kot
{
private:
	static Kot *jedyny;
	int nr = 0;
	Kot();
public:
	static Kot *DajEgzemplarz();
	virtual void daj_glos();
};

class singleton
{
public:
	static void main(std::vector<std::wstring> &Args);
};
