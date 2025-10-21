
import pytest

@pytest.fixture
def numbers_list():
    """A fixture that initializes a list containing numbers from 0-10."""
    return list(range(11))

def test_sum_of_list(numbers_list):
    """Asserts that the sum of the list is 55."""
    assert sum(numbers_list) == 55