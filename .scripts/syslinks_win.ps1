if (!$(Get-CimInstance -ClassName CIM_OperatingSystem).Caption.Contains("Windows")) {
	exit
}
if ($pwd -ccontains "/.scripts") {
	exit
}
cd ..
$packages = Get-ChildItem -Name -Directory | Select-String -pattern '[0-9]{1,2}_B*'
cd .netbeans\src
$currentSysLinks = Get-ChildItem -Name -Directory | Select-String -pattern "B[0-9]{1,2}_*"
for ($i = 0; $i -lt $currentSysLinks.length; $i++) {
	Remove-Item $currentSysLinks[$i] -Force -Confirm:$false
}

for ($i = 0; $i -lt $packages.length; $i++) {
	$pkgName = 'B' + $($i + 1) + $packages[$i] -replace "[0-9]_Boletin", "_"
	$sourceDir = "..\..\" + $packages[$i] + "\src"
	cmd /c mklink /J $pkgName $sourceDir
}