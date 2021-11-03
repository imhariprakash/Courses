double averageTemp(double *temps, int numOfTemps) {
	double result = 0.0;
	int i;
	for (i=0; i<numOfTemps; i++) {
		result = result + temps[i];
	}
	result = result / (double) numOfTemps;
	return result;
}

double maxTemp(double *temps, int numOfTemps) {
	double max = temps[0];
	int i;
	for (i=0; i<numOfTemps; i++) {
		if (max < temps[i]) {
			max = temps[i];
		}
	}
	return max;
}
