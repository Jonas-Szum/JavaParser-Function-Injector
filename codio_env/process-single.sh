#!/bin/bash

tests=~/workspace/cs474-hw1/test/edu/uic/cs474/hw1
test_file=`cat ~/workspace/test.txt`
grade=0

test_count=`ls $tests | grep $test_file | wc -l`

if [[ $test_count -ne 1 ]]; then
	exit 1
fi

test_name=`ls $tests | grep $test_file | sed 's/\.java//g'`
echo $test_name

pushd cs474-hw1 &> /dev/null
{
	if [[ -z $1 ]]; then
		ant -Dtest.single="$test_name" test-compile-single
	else
		echo $1
		ant -Dtest.single="$test_name" -Djvm.args="$1" debug-test-process-single
	fi
}
popd

exit 0
