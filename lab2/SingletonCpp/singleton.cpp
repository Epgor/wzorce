#include "singleton.h"

Kot *Kot::jedyny = new Kot();

Kot::Kot()
{
	nr++;
}

Kot *Kot::DajEgzemplarz()
{
	return jedyny;

}

void Kot::daj_glos()
{
	std::wcout << L"To ja singleton nr= " << nr << std::endl;
}

void singleton::main(std::vector<std::wstring> &Args)
{

	std::vector<Kot*> tablica(10);

	for (int i = 0; i < tablica.size(); i++)
	{
		tablica[i] = Kot::DajEgzemplarz();
	}

	for (auto K : tablica)
	{
		K->daj_glos();
	}
}
